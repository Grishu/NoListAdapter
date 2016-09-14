package tellh.nolistadapter_common;


import android.support.v4.util.SparseArrayCompat;

/**
 * Created by tlh on 2016/9/12 :)
 */
public abstract class ViewBinderProvider implements IViewBinderProvider, LayoutItemType {
    private IViewBinder viewBinder;

    @Override
    public final IViewBinder provideViewBinder(IListAdapter adapter, SparseArrayCompat<? extends IViewBinder> viewBinderPool, int position) {
        if (viewBinder == null) {
            viewBinder = viewBinderPool.get(getItemLayoutId(adapter));
        }
        return viewBinder;
    }
}