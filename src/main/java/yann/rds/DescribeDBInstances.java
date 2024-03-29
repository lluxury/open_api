package yann.rds;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;
import java.util.*;
import com.aliyuncs.rds.model.v20140815.*;
import config.Config;

/**
 * @program: open_api
 * @description:
 * @author: Yann
 * @create: 2019-08-17 23:29
 **/
public class DescribeDBInstances {
    public static void main(String[] args) {
//        注意清除id
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou",
                Config.ACCESS_KEY_ID,
                Config.ACCESS_KEY_SECRET);

        IAcsClient client = new DefaultAcsClient(profile);

        DescribeDBInstancesRequest request = new DescribeDBInstancesRequest();
        request.setRegionId("cn-hangzhou");
        //        request.setDBInstanceId(Config.DBInstanceId_BI);

        try{
//            DescribeDBInstancesRequest response = client.getAcsResponse(request);
            DescribeDBInstancesResponse response = client.getAcsResponse(request);

            System.out.println(new Gson().toJson(response));
        }catch (ServerException e){
            e.printStackTrace();
        }catch (ClientException e){
            System.out.println("ErrCode" + e.getErrCode());
            System.out.println("ErrMsg" + e.getErrMsg());
            System.out.println("RequestID" + e.getRequestId());
        }
    }
}
