import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myrecipebook.R
import com.example.myrecipebook.data.RecipeData

@Composable
fun ItemRow(recipedata: RecipeData) {
    Card(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(5.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(10.dp),
            Arrangement.SpaceBetween,
            Alignment.CenterVertically
        ) {
            Column(Modifier.fillMaxWidth(.8f)) {
                Text(text = recipedata.recipeName,
                    fontSize = 25.sp)
                Text(
                    text = recipedata.summary,
                    maxLines = 3
                )
                Text(text = "Cooking Time: ${recipedata.cookingTime}")
            }
            Image(
                painter = painterResource(id = recipedata.recipeImg),
                contentDescription = "",
            )
        }
    }
}