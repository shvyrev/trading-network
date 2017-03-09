package com.bsiag.ethereum.fxtradingnetwork.events.account;

import org.eclipse.scout.rt.shared.services.lookup.ILookupService;
import org.eclipse.scout.rt.shared.services.lookup.LookupCall;

public class WalletLookupCall extends LookupCall<String> {

  private static final long serialVersionUID = 1L;

  @Override
  protected Class<? extends ILookupService<String>> getConfiguredService() {
    return IWalletLookupService.class;
  }
}
