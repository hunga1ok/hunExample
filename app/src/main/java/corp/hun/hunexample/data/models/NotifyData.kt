package corp.hun.hunexample.data.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "notify_table")
@Parcelize
data class NotifyData(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description: String
): Parcelable
