package j23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RoleInsert {
	
	private DBConnectionMgr pool;
	
	public RoleInsert() {
		pool = DBConnectionMgr.getInstance();
	}
	
	public int saveRole(String roleName) {
		int successCount = 0;
		
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
//			DB와 연결한다.
			con = pool.getConnection();
//			DB에 입력할 sql문을 변수 sql에 저장
			sql = "insert into role_mst values (0, ?)";
//			DB에 변수 sql에 저장된 sql문을 입력 대기상태로 둔다 (RETURN_GENERATED_KEYS는 이후에 DB에서 Auto Incresement로 증가하는 KEY 값을 return해주기 위해 사용한다.)
			pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//			sql문의 첫번째 '?' 에 매개변수 roleName을 입력함
			pstmt.setString(1, roleName);
//			입력 대기상태에 있는 sql문을 DB에 입력한다
			successCount = pstmt.executeUpdate();
			
			int newKey = 0;
			
//			DB에서 생성된 KEY(role_id)를 변수 rs에 저장한다.
			ResultSet rs = pstmt.getGeneratedKeys();
			
			if(rs.next()) {
				newKey = rs.getInt(1);
			}
			
//			키값 출력
			System.out.println(newKey != 0 ? "새로운 키값: " + newKey : "키가 생성되지 않음");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return successCount;
	}
	
	public static void main(String[] args) {
		RoleInsert roleInsert = new RoleInsert();
		int successCount = roleInsert.saveRole("ROLE_TESTER");
		System.out.println("insert 성공 건수: " + successCount);
	}

}
