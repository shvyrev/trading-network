package com.bsiag.ethereum.fxtradingnetwork.events.shared.event;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications
 * recommended.
 */
@Generated(value = "com.bsiag.ethereum.fxtradingnetwork.events.client.event.AbstractDealsTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public abstract class AbstractDealsTablePageData extends AbstractTablePageData {

	private static final long serialVersionUID = 1L;

	@Override
	public AbstractDealsTableRowData addRow() {
		return (AbstractDealsTableRowData) super.addRow();
	}

	@Override
	public AbstractDealsTableRowData addRow(int rowState) {
		return (AbstractDealsTableRowData) super.addRow(rowState);
	}

	@Override
	public abstract AbstractDealsTableRowData createRow();

	@Override
	public Class<? extends AbstractTableRowData> getRowType() {
		return AbstractDealsTableRowData.class;
	}

	@Override
	public AbstractDealsTableRowData[] getRows() {
		return (AbstractDealsTableRowData[]) super.getRows();
	}

	@Override
	public AbstractDealsTableRowData rowAt(int index) {
		return (AbstractDealsTableRowData) super.rowAt(index);
	}

	public void setRows(AbstractDealsTableRowData[] rows) {
		super.setRows(rows);
	}

	public abstract static class AbstractDealsTableRowData extends AbstractTableRowData {

		private static final long serialVersionUID = 1L;
		public static final String dealId = "dealId";
		public static final String dealNr = "dealNr";
		public static final String amount = "amount";
		public static final String orderBookType = "orderBookType";
		public static final String exchangeRate = "exchangeRate";
		public static final String tradingAction = "tradingAction";
		public static final String status = "status";
		private String m_dealId;
		private String m_dealNr;
		private Long m_amount;
		private String m_orderBookType;
		private Double m_exchangeRate;
		private String m_tradingAction;
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

		public Long getAmount() {
			return m_amount;
		}

		public void setAmount(Long newAmount) {
			m_amount = newAmount;
		}

		public String getOrderBookType() {
			return m_orderBookType;
		}

		public void setOrderBookType(String newOrderBookType) {
			m_orderBookType = newOrderBookType;
		}

		public Double getExchangeRate() {
			return m_exchangeRate;
		}

		public void setExchangeRate(Double newExchangeRate) {
			m_exchangeRate = newExchangeRate;
		}

		public String getTradingAction() {
			return m_tradingAction;
		}

		public void setTradingAction(String newTradingAction) {
			m_tradingAction = newTradingAction;
		}

		public String getStatus() {
			return m_status;
		}

		public void setStatus(String newStatus) {
			m_status = newStatus;
		}
	}
}
