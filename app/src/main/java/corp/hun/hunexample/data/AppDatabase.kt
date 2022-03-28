package corp.hun.hunexample.data

import androidx.room.Database
import androidx.room.RoomDatabase
import corp.hun.hunexample.data.models.NotifyData

@Database(entities = [NotifyData::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
}