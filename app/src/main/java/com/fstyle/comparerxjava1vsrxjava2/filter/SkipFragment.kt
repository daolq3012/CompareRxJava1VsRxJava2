package com.fstyle.comparerxjava1vsrxjava2.filter

import com.fstyle.comparerxjava1vsrxjava2.BaseFragment
import com.fstyle.comparerxjava1vsrxjava2.R.string.first
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import io.reactivex.functions.Predicate

/**
 * Created by Sun on 7/15/2017.
 */
class SkipFragment : BaseFragment() {

  override fun doSomething() {
    val observable = getObservable()
    val filterObservable = observable.skip(2)
    // drop 2 item
    subscribe(filterObservable)
  }

  companion object {

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * *
     * @return A new instance of fragment BufferFragment.
     */
    fun newInstance(): SkipFragment {
      val fragment = SkipFragment()
      return fragment
    }
  }
}
