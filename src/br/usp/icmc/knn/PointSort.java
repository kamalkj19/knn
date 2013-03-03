/**
 * Copyright (c) 2010 Leonardo Nascimento Ferreira
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package br.usp.icmc.knn;

import java.util.Comparator;

/**
 *
 * @author leoferr
 */
public class PointSort implements Comparator<Point> {

    public int compare(Point p1, Point p2) {

        if (p1.currentDistance < p2.currentDistance){

            return -1;
        }

        else {

            return 1;
        }
    }
}
