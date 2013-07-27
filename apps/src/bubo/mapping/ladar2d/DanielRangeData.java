/*
 * Copyright (c) 2013, Peter Abeles. All Rights Reserved.
 *
 * This file is part of Project BUBO.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package bubo.mapping.ladar2d;

import georegression.struct.se.Se2_F64;

/**
 * @author Peter Abeles
 */
public class DanielRangeData {

	double timeStamp;

	// position of the robot when this observation was made
	private Se2_F64 position;
	// list of range measurements from the ladar
	private double []range;

	/**
	 * How many range measurements will there be.
	 *
	 * @param numRanges
	 */
	public DanielRangeData( int numRanges ) {
		this.range = new double[ numRanges ];
	}

	public DanielRangeData() {
	}

	public double getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(double timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Se2_F64 getPosition() {
		return position;
	}

	public void setPosition(Se2_F64 position) {
		this.position = position;
	}

	public double[] getRange() {
		return range;
	}

	public void setRange(double[] range) {
		this.range = range;
	}
}
