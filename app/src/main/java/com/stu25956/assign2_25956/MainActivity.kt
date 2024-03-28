package com.stu25956.assign2_25956

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.stu25956.assign2_25956.ui.theme.Assign2_25956Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assign2_25956Theme {
                Surface{
                    Navigation()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    Assign2_25956Theme {
        Navigation()
    }
}