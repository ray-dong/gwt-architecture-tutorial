package org.ducktools.tutorial.gwt.architecture.photoalbum.ui.application.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ApplicationDisplayImpl_ApplicationDisplayImplUiBinderImpl implements UiBinder<Widget, ApplicationDisplayImpl>, ApplicationDisplayImpl.ApplicationDisplayImplUiBinder {

  public Widget createAndBindUi(final ApplicationDisplayImpl owner) {

    org.ducktools.tutorial.gwt.architecture.photoalbum.ui.application.impl.ApplicationDisplayImpl_ApplicationDisplayImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.ducktools.tutorial.gwt.architecture.photoalbum.ui.application.impl.ApplicationDisplayImpl_ApplicationDisplayImplUiBinderImpl_GenBundle) GWT.create(org.ducktools.tutorial.gwt.architecture.photoalbum.ui.application.impl.ApplicationDisplayImpl_ApplicationDisplayImplUiBinderImpl_GenBundle.class);
    com.google.gwt.user.client.ui.HorizontalPanel applicationPanel = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);




    owner.applicationPanel = applicationPanel;

    return applicationPanel;
  }
}
