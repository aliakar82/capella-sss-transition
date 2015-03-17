/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *     
 * Contributors:
 *    Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.core.semantic.data.la;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.fa.FunctionPkg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Function Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalFunctionPkg#getOwnedLogicalFunctions <em>Owned Logical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalFunctionPkg#getOwnedLogicalFunctionPkgs <em>Owned Logical Function Pkgs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalFunctionPkg()
 * @model
 * @generated
 */
public interface LogicalFunctionPkg extends FunctionPkg {
	/**
	 * Returns the value of the '<em><b>Owned Logical Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.LogicalFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Functions</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalFunctionPkg_OwnedLogicalFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalFunction> getOwnedLogicalFunctions();

	/**
	 * Returns the value of the '<em><b>Owned Logical Function Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.LogicalFunctionPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Function Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Function Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalFunctionPkg_OwnedLogicalFunctionPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalFunctionPkg> getOwnedLogicalFunctionPkgs();

} // LogicalFunctionPkg