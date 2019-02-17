app.service("uploadService",function ($http) {

    //上传文件
    this.uploadFile=function () {
        var formData = new FormData();//获取form表单
        formData.append('file',file.files[0]);//绑定表单数据
        return $http(
            {
                url:'../upload.do',//提交的路径
                method:'post',//提交的方式
                data:formData,//表单数据
                headers:{'Content-Type':undefined},//设置Content-Type="multipart/form-data"
                transformRequest: angular.identity    //序列化表单数据
            }
        )

    }
})