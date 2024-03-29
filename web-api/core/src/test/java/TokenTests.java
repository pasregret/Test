

import static org.junit.Assert.assertNotEquals;

import com.lunz.cpfw.core.entity.CurrentUserDTO;
import com.lunz.cpfw.core.service.JwtService;

import org.junit.Test;

public class TokenTests {
    @Test
    public void getClaimsFromToken() {
        String token = "eyJhbGciOiJSUzI1NiIsImtpZCI6IjcwRkYzQTE1QjcyNjczOEY0ODcyOTEyREZCNEVCMEZFQTQ3REUxRjEiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJjUDg2RmJjbWM0OUljcEV0LTA2d19xUjk0ZkUifQ.eyJuYmYiOjE1NTg0MDQ2MjksImV4cCI6MTU1ODQwODIyOSwiaXNzIjoiaHR0cHM6Ly9pZGVudGl0eS1mYXQubHVuei5jbiIsImF1ZCI6WyJodHRwczovL2lkZW50aXR5LWZhdC5sdW56LmNuL3Jlc291cmNlcyIsImx1bnotc2hhcnAtdGVtcGxhdGUiXSwiY2xpZW50X2lkIjoiY3Bmdy1kZXYiLCJzdWIiOiI1ZmFjMDAwMC0zZTBhLTAwMTYtZGEzZS0wOGQ2ZDlkNTg5ZGYiLCJhdXRoX3RpbWUiOjE1NTg0MDQ2MjksImlkcCI6ImxvY2FsIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InduIiwidXNlcm5hbWUiOiJ3biIsIm5hbWUiOiJ3biIsIm9yZ2FuaXphdGlvbklkIjoiNWZhYzAwMDAtM2UwYS0wMDE2LTA1N2UtMDhkNmQyOTZjYjUxIiwib3JnYW5pemF0aW9uTmFtZSI6IumhtuWxguWFrOWPuCIsImRlcGFydG1lbnRJZCI6IjVmYWMwMDAwLTNlMGEtMDAxNi0wNTdlLTA4ZDZkMjk2Y2I1MSIsImRlcGFydG1lbnROYW1lIjoi6aG25bGC5YWs5Y-4IiwiYXV0aFRva2VuIjoiNDgzYjY3Y2EtMjc0Yy00ZTM0LTgwOTctMzg4MmQ5ZDc2NGMxIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjoiNWZhYzAwMDAtM2UwYS0wMDE2LWFjMmEtMDhkNmQyOTY5NTBkOui2hee6p-euoeeQhuWRmCIsInNjb3BlIjpbIm9wZW5pZCIsInByb2ZpbGUiLCJsdW56LXNoYXJwLXRlbXBsYXRlIl0sImFtciI6WyJwd2QiXX0.cmDh0eCRPcKNL2SAeXM6wQ3U554t3OGCaFnanYxcq35A15VO-bXkdOXUTb023gwEjH30Pmhu9IJ7p57sMCwzGKzb5pvbU9p3Y9b8jmllNLTu-XT5M9LdDtqO6WjQ_LkhkiK6bS89h7bhyav59TPGoQRpkULYCNrzVlYaU9eIzHoA36K6jQ68pcxWxMSUrwlBWKtMdw2vZSuwYPtyxjh48g0llWVwFT3an4L3SI0Mxu1evN4S07LWHx5j7J09xrANeFqByRjZnKrhiPZo9oCgBCdEvKeDeARXG7AqYEFOI8Ef-D2JMIDy-7h0GiQ0bB490E3EqZA30IS8--kJYmJlaw";
        CurrentUserDTO currentUserDTO = JwtService.getClaimsFromToken(token);

        assertNotEquals(null, currentUserDTO);
    }
}
