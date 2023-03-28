package com.raredev.vcspace.actions.main.edit;

import com.blankj.utilcode.util.ToastUtils;
import com.raredev.vcspace.R;
import com.raredev.vcspace.actions.ActionData;
import com.raredev.vcspace.actions.main.MainBaseAction;

public class FormatAction extends MainBaseAction {

  @Override
  public void performAction(ActionData data) {
    // EditorManager manager = (EditorManager) data.get(EditorManager.class);
    // manager.getCurrentEditor().formatCodeAsync();
    ToastUtils.showShort("Unable to perform action");
  }

  @Override
  public int getTitle() {
    return R.string.menu_format;
  }

  @Override
  public int getIcon() {
    return R.drawable.format_align_left;
  }
}