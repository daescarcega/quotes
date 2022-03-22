package edu.itesm.moviequotes.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.itesm.moviequotes.R
import edu.itesm.moviequotes.adapter.MovieQuotesAdapter
import edu.itesm.moviequotes.data.QuotesDataProvider
import edu.itesm.moviequotes.databinding.FragmentQuotesListBinding


/**
 * A simple [Fragment] subclass.
 * Use the [QuotesListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuotesListFragment : Fragment() {
    private lateinit var binding: FragmentQuotesListBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler : RecyclerView = binding.recyclerview
        val quotesAdapter = MovieQuotesAdapter(QuotesDataProvider.getDat() )
        recycler.layoutManager = LinearLayoutManager(context)
        recycler.adapter = quotesAdapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            FragmentQuotesListBinding.inflate(layoutInflater)
        return binding.root
    }


}