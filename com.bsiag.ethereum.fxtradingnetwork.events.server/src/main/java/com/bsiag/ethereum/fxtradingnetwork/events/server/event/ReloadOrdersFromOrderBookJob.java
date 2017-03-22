package com.bsiag.ethereum.fxtradingnetwork.events.server.event;

import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.util.concurrent.IRunnable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bsiag.ethereum.fxtradingnetwork.events.shared.event.INetworkService;

public class ReloadOrdersFromOrderBookJob implements IRunnable {
  private static final Logger LOG = LoggerFactory.getLogger(ReloadOrdersFromOrderBookJob.class);

  public static final String ID = "NetworkService.reloadOrdersFromOrderBook";

  @Override
  public void run() throws Exception {
    BEANS.get(INetworkService.class).synchronizeOrderBooks();
  }

}
