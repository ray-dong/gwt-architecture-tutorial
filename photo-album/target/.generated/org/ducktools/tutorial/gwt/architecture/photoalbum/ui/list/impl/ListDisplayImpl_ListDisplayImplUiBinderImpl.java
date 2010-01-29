package org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ListDisplayImpl_ListDisplayImplUiBinderImpl implements UiBinder<Widget, ListDisplayImpl>, ListDisplayImpl.ListDisplayImplUiBinder {

  public Widget createAndBindUi(final ListDisplayImpl owner) {

    org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.impl.ListDisplayImpl_ListDisplayImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.impl.ListDisplayImpl_ListDisplayImplUiBinderImpl_GenBundle) GWT.create(org.ducktools.tutorial.gwt.architecture.photoalbum.ui.list.impl.ListDisplayImpl_ListDisplayImplUiBinderImpl_GenBundle.class);
    com.google.gwt.user.client.ui.Label f_Label1 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);

    f_Label1.setText("Hello Photo App!");




    return f_Label1;
  }
}
