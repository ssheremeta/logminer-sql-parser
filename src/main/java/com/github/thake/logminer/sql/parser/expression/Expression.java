/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package com.github.thake.logminer.sql.parser.expression;

import com.github.thake.logminer.sql.parser.ASTNodeAccess;

public interface Expression extends ASTNodeAccess {

    void accept(ExpressionVisitor expressionVisitor);
}
