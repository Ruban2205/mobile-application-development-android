package in.rubangino.studentroomdatabase.DaoClass;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import in.rubangino.studentroomdatabase.EntityClass.UserModel;

@Dao
public interface Daoclass {

    @Insert
    void insertAllData(UserModel model);

    //Select All Data
    @Query("select * from  user")
    List<UserModel> getAllData();

    //DELETE DATA
    @Query("delete from user where `key`= :id")
    void deleteData(int id);

    //Update Data

    @Query("update user SET name= :name ,address =:address, phoneno =:phoneno where `key`= :key")
    void updateData(String name, String phoneno, String address, int key);


}