package com.example.socialproject.assign

import android.app.Activity
import android.util.Log
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.socialproject.homeFragment.HomeFragmentList1
import java.util.ArrayList

class AssignAdapter(fragmentManager: FragmentActivity) : FragmentStateAdapter(fragmentManager) {

    override fun getItemCount(): Int = 5

    override fun createFragment(position: Int): Fragment {
        if(position == 0){
            Log.d("TAG", position.toString() + " " + "성별 나이 프래그맨트 생성")
            return GenderAgeFragment()
        }
        else{
            Log.d("TAG", position.toString() + " " + "프래그맨트 생성 다른거")
            return GenderAgeFragment()
        }
    }
}