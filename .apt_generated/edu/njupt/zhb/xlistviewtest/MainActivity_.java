//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package edu.njupt.zhb.xlistviewtest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import edu.njupt.zhb.xlistviewtest.R.id;
import edu.njupt.zhb.xlistviewtest.R.layout;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class MainActivity_
    extends MainActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_main);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static MainActivity_.IntentBuilder_ intent(Context context) {
        return new MainActivity_.IntentBuilder_(context);
    }

    public static MainActivity_.IntentBuilder_ intent(Fragment supportFragment) {
        return new MainActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        btnList3 = ((Button) hasViews.findViewById(id.btnList3));
        btnList2 = ((Button) hasViews.findViewById(id.btnList2));
        btnList1 = ((Button) hasViews.findViewById(id.btnList1));
        {
            View view = hasViews.findViewById(id.btnList3);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MainActivity_.this.btnList3();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.btnList1);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MainActivity_.this.btnList1();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.btnList2);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MainActivity_.this.btnList2();
                    }

                }
                );
            }
        }
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;
        private Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, MainActivity_.class);
        }

        public IntentBuilder_(Fragment fragment) {
            fragmentSupport_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, MainActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public MainActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent_, requestCode);
            } else {
                if (context_ instanceof Activity) {
                    ((Activity) context_).startActivityForResult(intent_, requestCode);
                } else {
                    context_.startActivity(intent_);
                }
            }
        }

    }

}
