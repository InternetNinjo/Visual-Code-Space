package com.raredev.vcspace.ui.editor.completion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import com.google.android.material.color.MaterialColors;
import com.raredev.vcspace.util.Utils;
import com.raredev.vcspace.databinding.LayoutCompletionItemBinding;
import com.raredev.vcspace.R;
import io.github.rosemoe.sora.widget.component.EditorCompletionAdapter;

public class CompletionItemAdapter extends EditorCompletionAdapter {
  private LayoutCompletionItemBinding binding;

  @Override
  public int getItemHeight() {
    return Utils.pxToDp(getContext(), 48);
  }

  @Override
  protected View getView(int pos, View v, ViewGroup parent, boolean isCurrentCursorPosition) {
    binding = LayoutCompletionItemBinding.inflate(LayoutInflater.from(getContext()), parent, false);

    if (isCurrentCursorPosition) {
      binding
          .getRoot()
          .setBackgroundColor(
              MaterialColors.getColor(
                  getContext(), com.google.android.material.R.attr.colorControlHighlight, 0));
    } else {
      binding
          .getRoot()
          .setBackground(AppCompatResources.getDrawable(getContext(), R.drawable.ripple_effect));
    }

    var item = getItem(pos);

    binding.itemLabel.setText(item.label);
    binding.itemDesc.setText(item.desc);
    binding.itemIcon.setText(item.desc.subSequence(0, 1).toString().toUpperCase());
    return binding.getRoot();
  }
}