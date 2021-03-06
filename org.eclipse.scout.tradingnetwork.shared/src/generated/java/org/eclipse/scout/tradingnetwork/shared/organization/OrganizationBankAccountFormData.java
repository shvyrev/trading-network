package org.eclipse.scout.tradingnetwork.shared.organization;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "org.eclipse.scout.tradingnetwork.client.organization.OrganizationBankAccountForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class OrganizationBankAccountFormData extends AbstractFormData {

  private static final long serialVersionUID = 1L;

  public Balance getBalance() {
    return getFieldByClass(Balance.class);
  }

  public Currency getCurrency() {
    return getFieldByClass(Currency.class);
  }

  public OrganizationId getOrganizationId() {
    return getFieldByClass(OrganizationId.class);
  }

  public static class Balance extends AbstractValueFieldData<BigDecimal> {

    private static final long serialVersionUID = 1L;
  }

  public static class Currency extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;
  }

  public static class OrganizationId extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;
  }
}
