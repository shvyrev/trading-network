package org.eclipse.scout.tradingnetwork.shared.person;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "org.eclipse.scout.tradingnetwork.client.person.PersonNodeTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class PersonNodeTablePageData extends AbstractTablePageData {

  private static final long serialVersionUID = 1L;

  @Override
  public PersonNodeTableRowData addRow() {
    return (PersonNodeTableRowData) super.addRow();
  }

  @Override
  public PersonNodeTableRowData addRow(int rowState) {
    return (PersonNodeTableRowData) super.addRow(rowState);
  }

  @Override
  public PersonNodeTableRowData createRow() {
    return new PersonNodeTableRowData();
  }

  @Override
  public Class<? extends AbstractTableRowData> getRowType() {
    return PersonNodeTableRowData.class;
  }

  @Override
  public PersonNodeTableRowData[] getRows() {
    return (PersonNodeTableRowData[]) super.getRows();
  }

  @Override
  public PersonNodeTableRowData rowAt(int index) {
    return (PersonNodeTableRowData) super.rowAt(index);
  }

  public void setRows(PersonNodeTableRowData[] rows) {
    super.setRows(rows);
  }

  public static class PersonNodeTableRowData extends AbstractTableRowData {

    private static final long serialVersionUID = 1L;
  }
}