// Generated code from Butter Knife. Do not modify!
package com.example.al.alan2017summer.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.al.alan2017summer.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WorkFragment_ViewBinding implements Unbinder {
  private WorkFragment target;

  private View view2131558625;

  private View view2131558622;

  @UiThread
  public WorkFragment_ViewBinding(final WorkFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.submit_button, "method 'clickSubmit'");
    view2131558625 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickSubmit(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.quiz1, "method 'clickQuiz1'");
    view2131558622 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickQuiz1(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131558625.setOnClickListener(null);
    view2131558625 = null;
    view2131558622.setOnClickListener(null);
    view2131558622 = null;
  }
}
