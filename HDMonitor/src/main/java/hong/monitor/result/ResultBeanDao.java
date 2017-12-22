package hong.monitor.result;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "RESULT_BEAN".
*/
public class ResultBeanDao extends AbstractDao<ResultBean, Long> {

    public static final String TABLENAME = "RESULT_BEAN";

    /**
     * Properties of entity ResultBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property PidCpu = new Property(1, String.class, "pidCpu", false, "PID_CPU");
        public final static Property TotalCpu = new Property(2, String.class, "totalCpu", false, "TOTAL_CPU");
        public final static Property Fps = new Property(3, String.class, "fps", false, "FPS");
        public final static Property Net = new Property(4, String.class, "net", false, "NET");
        public final static Property Pss = new Property(5, String.class, "pss", false, "PSS");
        public final static Property PrivateDirty = new Property(6, String.class, "privateDirty", false, "PRIVATE_DIRTY");
    }


    public ResultBeanDao(DaoConfig config) {
        super(config);
    }
    
    public ResultBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"RESULT_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"PID_CPU\" TEXT," + // 1: pidCpu
                "\"TOTAL_CPU\" TEXT," + // 2: totalCpu
                "\"FPS\" TEXT," + // 3: fps
                "\"NET\" TEXT," + // 4: net
                "\"PSS\" TEXT," + // 5: pss
                "\"PRIVATE_DIRTY\" TEXT);"); // 6: privateDirty
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"RESULT_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ResultBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String pidCpu = entity.getPidCpu();
        if (pidCpu != null) {
            stmt.bindString(2, pidCpu);
        }
 
        String totalCpu = entity.getTotalCpu();
        if (totalCpu != null) {
            stmt.bindString(3, totalCpu);
        }
 
        String fps = entity.getFps();
        if (fps != null) {
            stmt.bindString(4, fps);
        }
 
        String net = entity.getNet();
        if (net != null) {
            stmt.bindString(5, net);
        }
 
        String pss = entity.getPss();
        if (pss != null) {
            stmt.bindString(6, pss);
        }
 
        String privateDirty = entity.getPrivateDirty();
        if (privateDirty != null) {
            stmt.bindString(7, privateDirty);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ResultBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String pidCpu = entity.getPidCpu();
        if (pidCpu != null) {
            stmt.bindString(2, pidCpu);
        }
 
        String totalCpu = entity.getTotalCpu();
        if (totalCpu != null) {
            stmt.bindString(3, totalCpu);
        }
 
        String fps = entity.getFps();
        if (fps != null) {
            stmt.bindString(4, fps);
        }
 
        String net = entity.getNet();
        if (net != null) {
            stmt.bindString(5, net);
        }
 
        String pss = entity.getPss();
        if (pss != null) {
            stmt.bindString(6, pss);
        }
 
        String privateDirty = entity.getPrivateDirty();
        if (privateDirty != null) {
            stmt.bindString(7, privateDirty);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public ResultBean readEntity(Cursor cursor, int offset) {
        ResultBean entity = new ResultBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // pidCpu
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // totalCpu
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // fps
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // net
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // pss
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // privateDirty
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ResultBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPidCpu(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTotalCpu(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setFps(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setNet(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPss(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPrivateDirty(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(ResultBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(ResultBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ResultBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
