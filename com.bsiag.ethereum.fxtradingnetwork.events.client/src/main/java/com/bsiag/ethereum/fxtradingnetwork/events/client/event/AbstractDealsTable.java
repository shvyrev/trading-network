package com.bsiag.ethereum.fxtradingnetwork.events.client.event;

import java.math.RoundingMode;

import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractDecimalColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractLongColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractSmartColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.form.fields.decimalfield.IDecimalField;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.code.ICodeType;

import com.bsiag.ethereum.fxtradingnetwork.events.client.Icons;
import com.bsiag.ethereum.fxtradingnetwork.events.shared.OrderBookTypeCodeType;
import com.bsiag.ethereum.fxtradingnetwork.events.shared.StatusCodeType;
import com.bsiag.ethereum.fxtradingnetwork.events.shared.event.TradingActionCodeType;

public abstract class AbstractDealsTable extends AbstractTable {

  @Override
  protected boolean getConfiguredAutoResizeColumns() {
    return true;
  }

  public DealIdColumn getDealIdColumn() {
    return getColumnSet().getColumnByClass(DealIdColumn.class);
  }

  public DealNrColumn getDealNrColumn() {
    return getColumnSet().getColumnByClass(DealNrColumn.class);
  }

  public AmountColumn getSellColumn() {
    return getColumnSet().getColumnByClass(AmountColumn.class);
  }

  public OrderBookTypeColumn getEndsColumn() {
    return getColumnSet().getColumnByClass(OrderBookTypeColumn.class);
  }

  public ExchangeRateColumn getBuyColumn() {
    return getColumnSet().getColumnByClass(ExchangeRateColumn.class);
  }

  public TradingActionColumn getBuyCurrencyColumn() {
    return getColumnSet().getColumnByClass(TradingActionColumn.class);
  }

  public StatusColumn getStatusColumn() {
    return getColumnSet().getColumnByClass(StatusColumn.class);
  }

  @Override
  protected String getConfiguredDefaultIconId() {
    return Icons.World;
  }

  @Order(1000)
  public class DealIdColumn extends AbstractStringColumn {

    @Override
    protected boolean getConfiguredDisplayable() {
      return false;
    }

    @Override
    protected boolean getConfiguredPrimaryKey() {
      return true;
    }
  }

  @Order(2000)
  public class DealNrColumn extends AbstractStringColumn {

    @Override
    protected String getConfiguredHeaderText() {
      return TEXTS.get("Deal-Nr");
    }

    @Override
    protected int getConfiguredWidth() {
      return 100;
    }

    @Override
    protected int getConfiguredHorizontalAlignment() {
      return 0;
    }
  }

  @Order(4000)
  public class OrderBookTypeColumn extends AbstractSmartColumn<String> {

    @Override
    protected String getConfiguredHeaderText() {
      return TEXTS.get("OrderBookType");
    }

    @Override
    protected int getConfiguredHorizontalAlignment() {
      return 0;
    }

    @Override
    protected int getConfiguredWidth() {
      return 100;
    }

    @Override
    protected Class<? extends ICodeType<?, String>> getConfiguredCodeType() {
      return OrderBookTypeCodeType.class;
    }
  }

  @Order(3000)
  public class AmountColumn extends AbstractLongColumn {

    @Override
    protected String getConfiguredHeaderText() {
      return TEXTS.get("Amount");
    }

    @Override
    protected int getConfiguredWidth() {
      return 120;
    }

    @Override
    protected int getConfiguredHorizontalAlignment() {
      return 0;
    }
  }

  @Order(5000)
  public class ExchangeRateColumn extends AbstractDecimalColumn<Double> {

    @Override
    protected String getConfiguredHeaderText() {
      return TEXTS.get("ExchangeRate");
    }

    @Override
    protected int getConfiguredWidth() {
      return 120;
    }

    @Override
    protected int getConfiguredHorizontalAlignment() {
      return 0;
    }

    @Override
    protected Double getConfiguredMinValue() {
      return Double.MIN_VALUE;
    }

    @Override
    protected Double getConfiguredMaxValue() {
      return Double.MAX_VALUE;
    }

    @Override
    protected RoundingMode getConfiguredRoundingMode() {
      return RoundingMode.FLOOR;
    }

    @Override
    protected int getConfiguredMaxIntegerDigits() {
      return super.getConfiguredMaxIntegerDigits();
    }

    @Override
    protected IDecimalField<Double> createDefaultEditor() {
      return null;
    }
  }

  @Order(6000)
  public class TradingActionColumn extends AbstractSmartColumn<String> {

    @Override
    protected String getConfiguredHeaderText() {
      return TEXTS.get("TradingAction");
    }

    @Override
    protected int getConfiguredHorizontalAlignment() {
      return 0;
    }

    @Override
    protected int getConfiguredWidth() {
      return 100;
    }

    @Override
    protected Class<? extends ICodeType<?, String>> getConfiguredCodeType() {
      return TradingActionCodeType.class;
    }
  }

  @Order(7000)
  public class StatusColumn extends AbstractSmartColumn<String> {

    @Override
    protected String getConfiguredHeaderText() {
      return TEXTS.get("Status");
    }

    @Override
    protected int getConfiguredWidth() {
      return 250;
    }

    @Override
    protected int getConfiguredHorizontalAlignment() {
      return 0;
    }

    @Override
    public Class<? extends ICodeType<?, String>> getConfiguredCodeType() {
      return StatusCodeType.class;
    }
  }
}