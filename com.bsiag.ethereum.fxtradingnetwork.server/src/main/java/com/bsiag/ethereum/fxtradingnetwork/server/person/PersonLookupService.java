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
package com.bsiag.ethereum.fxtradingnetwork.server.person;

import com.bsiag.ethereum.fxtradingnetwork.server.sql.SQLs;
import com.bsiag.ethereum.fxtradingnetwork.shared.person.IPersonLookupService;
import org.eclipse.scout.rt.server.jdbc.lookup.AbstractSqlLookupService;

public class PersonLookupService extends AbstractSqlLookupService<String> implements IPersonLookupService {

  @Override
  protected String getConfiguredSqlSelect() {
    return SQLs.PERSON_LOOKUP;
  }
}
