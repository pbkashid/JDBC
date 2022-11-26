import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class demo3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		CREATE DEFINER=`root`@`localhost` PROCEDURE `inOutExample`(inOut initialValue int)
				BEGIN
				declare i int default 0;
				select count(*) into i from emp;

				set initialValue =initialValue +i;
				END
				CREATE DEFINER=`root`@`localhost` PROCEDURE `GetCustomerShipping`(
					IN  pCustomerNUmber INT, 
					OUT pShipping       VARCHAR(50)
				)
				BEGIN
				    DECLARE customerCountry VARCHAR(100);

				SELECT 
				    country
				INTO customerCountry FROM
				    customer
				WHERE
				    Id = pCustomerNUmber;

				    CASE customerCountry
						WHEN  'Germany' THEN
						   SET pShipping = '2-day Shipping';
						WHEN 'UK' THEN
						   SET pShipping = '3-day Shipping';
						ELSE
						   SET pShipping = '5-day Shipping';
					END CASE;
				END

	}

}
