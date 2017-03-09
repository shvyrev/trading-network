package com.bsiag.ethereum.fxtradingnetwork.events.shared.event;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "com.bsiag.ethereum.fxtradingnetwork.events.client.event.DealsTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class DealTablePageData extends AbstractTablePageData {

  private static final long serialVersionUID = 1L;

  @Override
  public DealTableRowData addRow() {
    return (DealTableRowData) super.addRow();
  }

  @Override
  public DealTableRowData addRow(int rowState) {
    return (DealTableRowData) super.addRow(rowState);
  }

  @Override
  public DealTableRowData createRow() {
    return new DealTableRowData();
  }

  @Override
  public Class<? extends AbstractTableRowData> getRowType() {
    return DealTableRowData.class;
  }

  @Override
  public DealTableRowData[] getRows() {
    return (DealTableRowData[]) super.getRows();
  }

  @Override
  public DealTableRowData rowAt(int index) {
    return (DealTableRowData) super.rowAt(index);
  }

  public void setRows(DealTableRowData[] rows) {
    super.setRows(rows);
  }

  public static class DealTableRowData extends AbstractTableRowData {

    private static final long serialVersionUID = 1L;
    public static final String dealId = "dealId";
    public static final String dealNr = "dealNr";
    public static final String sell = "sell";
    public static final String sellCurrency = "sellCurrency";
    public static final String buy = "buy";
    public static final String buyCurrency = "buyCurrency";
    public static final String status = "status";
    private String m_dealId;
    private String m_dealNr;
    private Long m_sell;
    private String m_sellCurrency;
    private Long m_buy;
    private String m_buyCurrency;
    private String m_status;

    public String getDealId() {
      return m_dealId;
    }

    public void setDealId(String newDealId) {
      m_dealId = newDealId;
    }

    public String getDealNr() {
      return m_dealNr;
    }

    public void setDealNr(String newDealNr) {
      m_dealNr = newDealNr;
    }

    public Long getSell() {
      return m_sell;
    }

    public void setSell(Long newSell) {
      m_sell = newSell;
    }

    public String getSellCurrency() {
      return m_sellCurrency;
    }

    public void setSellCurrency(String newSellCurrency) {
      m_sellCurrency = newSellCurrency;
    }

    public Long getBuy() {
      return m_buy;
    }

    public void setBuy(Long newBuy) {
      m_buy = newBuy;
    }

    public String getBuyCurrency() {
      return m_buyCurrency;
    }

    public void setBuyCurrency(String newBuyCurrency) {
      m_buyCurrency = newBuyCurrency;
    }

    public String getStatus() {
      return m_status;
    }

    public void setStatus(String newStatus) {
      m_status = newStatus;
    }
  }
}
