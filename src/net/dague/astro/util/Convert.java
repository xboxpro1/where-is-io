/*
  Copyright 2010 Sean Dague

  This file is part of Where is Io

  Where is Io is free software: you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.
  
  Where is Io is distributed in the hope that it will be useful, but
  WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
  General Public License for more details.
  
  You should have received a copy of the GNU General Public License
  along with Where is Io.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.dague.astro.util;

public class Convert {
	
	public static float au2km(float au)
	{
		return au * AstroConst.KM_IN_AU;
	}
	
	public static double deg2rad(double d) 
	{
		return d / 360.0 * 2 * Math.PI;
	}
	
	public static double rad2deg(double r)
	{
		return r / (2 * Math.PI) * 360.0;
	}
}
