/*
 * Copyright (c) 2011, 2018 Oracle and/or its affiliates. All rights reserved.
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
//     Gordon Yorke - Initial development
//

package org.eclipse.persistence.internal.jpa.querydef;

import jakarta.persistence.criteria.Expression;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.ListJoin;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.metamodel.Bindable;
import jakarta.persistence.metamodel.ManagedType;
import jakarta.persistence.metamodel.Metamodel;

import org.eclipse.persistence.internal.helper.ClassConstants;

/**
 * <p>
 * <b>Purpose</b>: Contains the implementation of the Join interface of the JPA
 * criteria API.
 * <p>
 * <b>Description</b>: This class represents a join of an attribute from a "From"element.
 * <p>
 *
 * @see jakarta.persistence.criteria ListJoin
 *
 * @author gyorke
 * @since EclipseLink 1.2
 */

public class ListJoinImpl<Z, X>  extends JoinImpl<Z, X> implements ListJoin<Z, X> {

    public <T> ListJoinImpl(Path<Z> parentPath, ManagedType managedType, Metamodel metamodel, Class<X> javaClass, org.eclipse.persistence.expressions.Expression expressionNode, Bindable<T> modelArtifact){
        this(parentPath, managedType, metamodel, javaClass, expressionNode, modelArtifact,JoinType.INNER);
    }

    public <T> ListJoinImpl(Path<Z> parentPath, ManagedType managedType, Metamodel metamodel, Class<X> javaClass, org.eclipse.persistence.expressions.Expression expressionNode, Bindable<T> modelArtifact, JoinType joinType){
        super(parentPath, managedType, metamodel, javaClass, expressionNode, modelArtifact, joinType);
    }

    public <T> ListJoinImpl(Path<Z> parentPath, ManagedType managedType, Metamodel metamodel, Class<X> javaClass, org.eclipse.persistence.expressions.Expression expressionNode, Bindable<T> modelArtifact, JoinType joinType, FromImpl correlatedParent){
        super(parentPath, managedType, metamodel, javaClass, expressionNode, modelArtifact, joinType, correlatedParent);
    }

    /**
    * Return the metamodel representation for the collection.
    * @return metamodel type representing the Collection that is
    * the target of the join
    */
    public jakarta.persistence.metamodel.ListAttribute<? super Z, X> getModel(){
        return (jakarta.persistence.metamodel.ListAttribute<? super Z, X>)this.modelArtifact;
    }

    public Expression<Integer> index() {
        return new ExpressionImpl<Integer>(this.metamodel, ClassConstants.INTEGER, this.currentNode.index());
    }

    public ListJoinImpl<Z, X> on(Expression<Boolean> restriction) {
        return (ListJoinImpl<Z, X>)super.on(restriction);
    }

    public ListJoinImpl<Z, X> on(Predicate... restrictions) {
        return (ListJoinImpl<Z, X>)super.on(restrictions);
    }

}
