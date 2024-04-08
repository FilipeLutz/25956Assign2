package com.stu25956.assign2_25956

/**
 * CA2 - Movie Booking App
 * Filipe Lutz Mariano 25956
 */

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.stu25956.assign2_25956.ui.theme.Assign2_25956Theme

/**
 * This is the main activity for the application.
 * It sets the content view to the Assign2_25956Theme with a Navigation component.
 */
class MainActivity : ComponentActivity() {
    /**
     * This function is called when the activity is starting.
     * It calls the parent's onCreate function and sets the content view.
     * @param savedInstanceState If the activity is being re-initialized after previously being shut down
     * then this Bundle contains the data it most recently supplied in onSaveInstanceState(Bundle).
     * Note: Otherwise it is null.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assign2_25956Theme {
                Navigation()
            }
        }
    }
}

/**
 * This is a preview function for the Home screen.
 * It shows a preview of the Assign2_25956Theme with a Navigation component.
 * Note: This function is not called during the runtime of the app, it is only used in the design editor.
 */
@Preview(showBackground = true)
@Composable
fun HomePreview() {
    Assign2_25956Theme {
        Navigation()
    }
}