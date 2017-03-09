/*******************************************************************************
 * Copyright (c) 2015 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.html
 *
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package com.bsiag.ethereum.fxtradingnetwork.events.client.event;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.IForm;
import org.eclipse.scout.rt.client.ui.form.fields.bigdecimalfield.AbstractBigDecimalField;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractCancelButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractOkButton;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.client.ui.form.fields.longfield.AbstractLongField;
import org.eclipse.scout.rt.client.ui.form.fields.radiobuttongroup.AbstractRadioButtonGroup;
import org.eclipse.scout.rt.client.ui.form.fields.smartfield.AbstractSmartField;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.exception.VetoException;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.code.ICodeType;

import com.bsiag.ethereum.fxtradingnetwork.client.common.AbstractDirtyFormHandler;
import com.bsiag.ethereum.fxtradingnetwork.client.common.AbstractNotesBox.NotesField;
import com.bsiag.ethereum.fxtradingnetwork.events.client.event.DealForm.MainBox.CancelButton;
import com.bsiag.ethereum.fxtradingnetwork.events.client.event.DealForm.MainBox.GeneralBox;
import com.bsiag.ethereum.fxtradingnetwork.events.client.event.DealForm.MainBox.GeneralBox.SellGroupBox;
import com.bsiag.ethereum.fxtradingnetwork.events.client.event.DealForm.MainBox.GeneralBox.SellGroupBox.AmountField;
import com.bsiag.ethereum.fxtradingnetwork.events.client.event.DealForm.MainBox.GeneralBox.SellGroupBox.ExchangeRateField;
import com.bsiag.ethereum.fxtradingnetwork.events.client.event.DealForm.MainBox.GeneralBox.SellGroupBox.OrderBookTypeField;
import com.bsiag.ethereum.fxtradingnetwork.events.client.event.DealForm.MainBox.GeneralBox.SellGroupBox.TradingActionBox;
import com.bsiag.ethereum.fxtradingnetwork.events.client.event.DealForm.MainBox.OkButton;
import com.bsiag.ethereum.fxtradingnetwork.events.shared.OrderBookTypeCodeType;
import com.bsiag.ethereum.fxtradingnetwork.events.shared.event.DealFormData;
import com.bsiag.ethereum.fxtradingnetwork.events.shared.event.IDealService;
import com.bsiag.ethereum.fxtradingnetwork.events.shared.event.TradingActionCodeType;
import com.bsiag.ethereum.fxtradingnetwork.events.shared.event.UpdateDealPermission;

@FormData(value = DealFormData.class, sdkCommand = FormData.SdkCommand.CREATE)
public class DealForm extends AbstractForm {

  private String dealId;

  private String organizationId;
  private String dealNr;
  private String status;

  @FormData
  public String getStatus() {
    return status;
  }

  @FormData
  public void setStatus(String status) {
    this.status = status;
  }

  @FormData
  public String getOrganizationId() {
    return organizationId;
  }

  @FormData
  public String getDealNr() {
    return dealNr;
  }

  @FormData
  public void setDealNr(String dealNr) {
    this.dealNr = dealNr;
  }

  @FormData
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  @FormData
  public String getDealId() {
    return dealId;
  }

  @FormData
  public void setDealId(String dealId) {
    this.dealId = dealId;
  }

  @Override
  protected String getConfiguredTitle() {
    return TEXTS.get("Deal");
  }

  @Override
  protected int getConfiguredDisplayHint() {
    return IForm.DISPLAY_HINT_VIEW;
  }

  public void startModify() {
    startInternalExclusive(new ModifyHandler());
  }

  public void startNew() {
    startInternal(new NewHandler());
  }

  @Override
  public void execStored() {
    getDesktop().dataChanged(IDealService.notificationEnum.Deals);
  }

  public CancelButton getCancelButton() {
    return getFieldByClass(CancelButton.class);
  }

  public NotesField getNotesField() {
    return getFieldByClass(NotesField.class);
  }

  public GeneralBox getGeneralBox() {
    return getFieldByClass(GeneralBox.class);
  }

  public MainBox getMainBox() {
    return getFieldByClass(MainBox.class);
  }

  public SellGroupBox getSellGroupBox() {
    return getFieldByClass(SellGroupBox.class);
  }

  public ExchangeRateField getExchangeRateField() {
    return getFieldByClass(ExchangeRateField.class);
  }

  public TradingActionBox getbuyAndSellRadioButtonGroupBox() {
    return getFieldByClass(TradingActionBox.class);
  }

  public OkButton getOkButton() {
    return getFieldByClass(OkButton.class);
  }

  public OrderBookTypeField getSellCurrencyField() {
    return getFieldByClass(OrderBookTypeField.class);
  }

  public AmountField getSellAmountField() {
    return getFieldByClass(AmountField.class);
  }

  @Override
  public Object computeExclusiveKey() {
    return getDealId();
  }

  @Order(1)
  public class MainBox extends AbstractGroupBox {

    @Order(10)
    public class GeneralBox extends AbstractGroupBox {
      @Override
      protected int getConfiguredGridW() {
        return 2;
      }

      @Override
      protected int getConfiguredGridH() {
        return 1;
      }

      @Override
      protected int getConfiguredGridColumnCount() {
        return 2;
      }

      @Order(-1000)
      public class SellGroupBox extends AbstractGroupBox {

        @Override
        protected int getConfiguredGridW() {
          return 1;
        }

        @Override
        protected String getConfiguredLabel() {
          return TEXTS.get("Details");
        }

        @Override
        protected int getConfiguredGridColumnCount() {
          return 1;
        }

        @Order(-1000)
        public class TradingActionBox extends AbstractRadioButtonGroup<String> {
          @Override
          protected String getConfiguredLabel() {
            return TEXTS.get("BuyOrSell");
          }

          @Override
          public void setMandatory(boolean b) {
            super.setMandatory(true);
          }

          @Override
          protected Class<? extends ICodeType<?, String>> getConfiguredCodeType() {
            return TradingActionCodeType.class;
          }
        }

        @Order(10)
        public class OrderBookTypeField extends AbstractSmartField<String> {
          @Override
          public void setMandatory(boolean b) {
            super.setMandatory(true);
          }

          @Override
          protected String getConfiguredLabel() {
            return TEXTS.get("OrderBookType");
          }

          @Override
          protected Class<OrderBookTypeCodeType> getConfiguredCodeType() {
            return OrderBookTypeCodeType.class;
          }

          // TODO execFilterBrowseLookupResult(): Liste neuladen und filtern.
        }

        @Order(20)
        public class AmountField extends AbstractLongField {

          @Override
          public void setMandatory(boolean b) {
            super.setMandatory(true);
          }

          @Override
          protected String getConfiguredLabel() {
            return TEXTS.get("Amount");
          }

          @Override
          protected Long execValidateValue(Long rawValue) {
            if (null != rawValue && rawValue <= 0) {
              throw new VetoException(TEXTS.get("AmountValidationError"));
            }
            return super.execValidateValue(rawValue);
          }
        }

        @Order(30)
        public class ExchangeRateField extends AbstractBigDecimalField {
          @Override
          public void setMandatory(boolean b) {
            super.setMandatory(true);
          }

          @Override
          protected String getConfiguredLabel() {
            return TEXTS.get("ExchangeRate");
          }

          @Override
          public int getFractionDigits() {
            return 4;
          }

          @Override
          protected void execInitField() {
            DecimalFormat format = new DecimalFormat("0.0000");
            format.setMinimumFractionDigits(0);
            // format.setMaximumFractionDigits(19);
            setFormat(format);
          }

          @Override
          protected BigDecimal execValidateValue(BigDecimal rawValue) {
            if (null != rawValue && rawValue.signum() <= 0) {
              throw new VetoException(TEXTS.get("SellAmountValidationError"));
            }
            return super.execValidateValue(rawValue);
          }
        }

      }
    }

    @Order(100)
    public class OkButton extends AbstractOkButton {
    }

    @Order(101)
    public class CancelButton extends AbstractCancelButton {
    }
  }

  public class ModifyHandler extends AbstractDirtyFormHandler {

    @Override
    protected void execLoad() {
      DealFormData formData = new DealFormData();
      exportFormData(formData);
      formData = BEANS.get(IDealService.class).load(formData);
      importFormData(formData);
      setEnabledPermission(new UpdateDealPermission());
    }

    @Override
    protected void execStore() {
      DealFormData formData = new DealFormData();
      exportFormData(formData);
      formData = BEANS.get(IDealService.class).store(formData);
    }

    @Override
    protected boolean getConfiguredOpenExclusive() {
      return true;
    }
  }

  public class NewHandler extends AbstractFormHandler {

    @Override
    protected void execLoad() {
      DealFormData formData = new DealFormData();
      exportFormData(formData);
      formData = BEANS.get(IDealService.class).prepareCreate(formData);
      importFormData(formData);
    }

    @Override
    protected void execStore() {
      DealFormData formData = new DealFormData();
      exportFormData(formData);
      formData = BEANS.get(IDealService.class).create(formData);
    }
  }
}
