package com.stu25956.assign2_25956

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.stu25956.assign2_25956.ui.theme.Assign2_25956Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assign2_25956Theme {

            }
        }
    }
}