package com.eftimoff.components.views.viewpager.views;


import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Adapter for ViewPager but with views , not fragments.
 * <p/>
 * Created by georgi.eftimov on 22/06/2015.
 */
public abstract class ViewPagerAdapter extends PagerAdapter {

    private final LayoutInflater mLayoutInflater;
    private final Context mContext;

    public ViewPagerAdapter(final Context context) {
        mLayoutInflater = LayoutInflater.from(context);
        mContext = context.getApplicationContext();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        final View page = mLayoutInflater.inflate(getItemLayout(position), container, false);
        onViewCreated(mContext, page, position);
        return page;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    public abstract int getItemLayout(final int position);

    protected abstract void onViewCreated(final Context context, final View view, final int position);
}
