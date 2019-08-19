//package rds
package main
import (
	"fmt"
	"github.com/aliyun/alibaba-cloud-sdk-go/services/rds"
	"github.com/lluxury/open_api/src/main/java/config"
)

func main() {
	client, err := rds.NewClientWithAccessKey("cn-hangzhou",config.ACCESS_KEY_ID,config.ACCESS_KEY_SECRET)

	request := rds.CreateDescribeDBInstancesRequest()
	request.Scheme = "https"

	response,err := client.DescribeDBInstances(request)
	if err != nil {
		fmt.Print(err.Error())
	}
	fmt.Printf("response is %#v\n", response)
}

