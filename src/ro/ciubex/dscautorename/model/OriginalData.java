/**
 * This file is part of DSCAutoRename application.
 * 
 * Copyright (C) 2014 Claudiu Ciobotariu
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ro.ciubex.dscautorename.model;

import android.net.Uri;

/**
 * The model used to store image or video DB informations.
 * 
 * @author Claudiu Ciobotariu
 * 
 */
public class OriginalData {
	private int mId;
	private Uri mUri;
	private String mData;
	private String mTitle;
	private String mDisplayName;

	public OriginalData(int id, Uri uri, String data, String title,
			String displayName) {
		this.mId = id;
		this.mUri = uri;
		this.mData = data;
		this.mTitle = title;
		this.mDisplayName = displayName;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return mId;
	}

	/**
	 * @return the Uri
	 */
	public Uri getUri() {
		return mUri;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return mData;
	}

	/**
	 * @return the mTitle
	 */
	public String getTitle() {
		return mTitle;
	}

	/**
	 * @return the mDisplayName
	 */
	public String getDisplayName() {
		return mDisplayName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mId;
		result = prime * result + ((mUri == null) ? 0 : mUri.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof OriginalData)) {
			return false;
		}
		OriginalData other = (OriginalData) obj;
		if (mId != other.mId) {
			return false;
		}
		if (mUri == null) {
			if (other.mUri != null) {
				return false;
			}
		} else if (!mUri.equals(other.mUri)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("OriginalData");
		builder.append(" [Uri=").append(mUri).append(", Id=").append(mId)
				.append(", Data=").append(mData).append(", DisplayName=")
				.append(mDisplayName).append(", Title=").append(mTitle)
				.append("]");
		return builder.toString();
	}

}
