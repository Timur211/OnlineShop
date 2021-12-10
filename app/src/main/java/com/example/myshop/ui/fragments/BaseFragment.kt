package com.example.myshop.ui.fragments

import android.app.Dialog
import androidx.fragment.app.Fragment
import com.example.myshop.R
import kotlinx.android.synthetic.main.dialog_progess.*


open class BaseFragment : Fragment() {


    private lateinit var mProgressDialog: Dialog


    fun showProgressDialog(text: String) {
        mProgressDialog = Dialog(requireActivity())

        /*Set the screen content from a layout resource.
        The resource will be inflated, adding all top-level views to the screen.*/
        mProgressDialog.setContentView(R.layout.dialog_progess)

        mProgressDialog.tv_progress_text.text = text

        mProgressDialog.setCancelable(false)
        mProgressDialog.setCanceledOnTouchOutside(false)

        //Start the dialog and display it on screen.
        mProgressDialog.show()
    }


    fun hideProgressDialog() {
        mProgressDialog.dismiss()
    }
}