/*
 * Copyright (c) 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     tware - initial implementation
package org.eclipse.persistence.internal.jpa.metamodel.proxy;

import java.util.Set;

import jakarta.persistence.metamodel.SetAttribute;

/**
 * A proxy class that allows EclipseLink to trigger the deployment of a persistence unit
 * as an SetAttribute is accessed in the metamodel.
 * @author tware
 *
 * @param <X>
 * @param <V>
 */
public class SetAttributeProxyImpl<X, V> extends PluralAttributeProxyImpl<X, Set<V>, V> implements SetAttribute<X, V> {

}
