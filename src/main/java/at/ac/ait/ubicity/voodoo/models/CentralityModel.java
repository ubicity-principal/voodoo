/**
    Copyright (C) 2014  AIT / Austrian Institute of Technology
    http://www.ait.ac.at

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see http://www.gnu.org/licenses/agpl-3.0.html
 */

package at.ac.ait.ubicity.voodoo.models;

import java.util.Set;

/**
 *
 * @author User
 * @param <G> A ( subclass of ) PropertyGraph for which we want to compute a centrality model
 */
@FunctionalInterface
public interface CentralityModel< G extends PropertyGraph> {
    
    
    public Set< Centrality< G > > compute( G g );
}
