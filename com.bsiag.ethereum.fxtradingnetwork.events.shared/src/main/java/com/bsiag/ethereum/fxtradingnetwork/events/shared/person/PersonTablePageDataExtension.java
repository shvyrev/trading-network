package com.bsiag.ethereum.fxtradingnetwork.events.shared.person;

import java.io.Serializable;

import javax.annotation.Generated;

import org.eclipse.scout.rt.platform.extension.Extends;

import com.bsiag.ethereum.fxtradingnetwork.shared.person.PersonTablePageData.PersonTableRowData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Extends(PersonTableRowData.class)
@Generated(value = "com.bsiag.ethereum.fxtradingnetwork.events.client.person.PersonTablePageExtension", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class PersonTablePageDataExtension implements Serializable {

  private static final long serialVersionUID = 1L;
  public static final String events = "events";
  private Long m_events;

  public Long getEvents() {
    return m_events;
  }

  public void setEvents(Long newEvents) {
    m_events = newEvents;
  }
}
