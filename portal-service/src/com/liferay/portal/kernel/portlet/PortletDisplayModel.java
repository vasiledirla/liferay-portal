/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.kernel.portlet;

import com.liferay.portal.theme.PortletDisplay;

/**
 * @author Shuyang Zhou
 */
public class PortletDisplayModel {

	public PortletDisplayModel(PortletDisplay portletDisplay) {
		_id = portletDisplay.getId();
		_instanceId = portletDisplay.getInstanceId();
		_portletName = portletDisplay.getPortletName();
		_resourcePK = portletDisplay.getResourcePK();
		_rootPortletId = portletDisplay.getRootPortletId();
		_title = portletDisplay.getTitle();
	}

	public String getId() {
		return _id;
	}

	public String getInstanceId() {
		return _instanceId;
	}

	public String getPortletName() {
		return _portletName;
	}

	public String getResourcePK() {
		return _resourcePK;
	}

	public String getRootPortletId() {
		return _rootPortletId;
	}

	public String getTitle() {
		return _title;
	}

	private String _id;
	private String _instanceId;
	private String _portletName;
	private String _resourcePK;
	private String _rootPortletId;
	private String _title;

}