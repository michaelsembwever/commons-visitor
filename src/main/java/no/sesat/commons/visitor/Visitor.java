/*
 * Copyright (2005-2008) Schibsted Søk AS
 * This file is part of Sesat Commons.
 *
 *   Sesat Commons is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Sesat Commons is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with Sesat Commons.  If not, see <http://www.gnu.org/licenses/>.
 */
package no.sesat.commons.visitor;

/** Interface for Classes that will implement the Visitor pattern.
 * See complimentary Visitable interface.
 *
 * @version $Id$
 *
 */
public interface Visitor {

    /** Method to hold implementation for what the visitor is supposed to do to the Visitable object.
     *
     * @param visitable the object the visitor will operate on.
     */
    void visit(Visitable visitable);
}
