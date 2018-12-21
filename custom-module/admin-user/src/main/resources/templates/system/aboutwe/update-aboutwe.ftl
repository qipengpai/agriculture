<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>关于我们</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
  <link rel="stylesheet" href="${re.contextPath}/plugin/layui/css/layui.css">
  <link rel="stylesheet" href="${re.contextPath}/plugin/ztree/css/metroStyle/metroStyle.css">
  <script type="text/javascript" src="${re.contextPath}/plugin/jquery/jquery-3.2.1.min.js"></script>
  <script type="text/javascript" src="${re.contextPath}/plugin/layui/layui.all.js" charset="utf-8"></script>
</head>
<script type="text/javascript">
  (function($) {
    $.fn.disable = function () {
      return $(this).find("*").each(function () {
        $(this).attr("disabled", "disabled");
      });
    }
  })(jQuery);
</script>
<script type="text/javascript">
  $(document).ready(function() {
    var flag='${detail}';
    if(flag){
      $("form").disable();
    }
  });
</script>
<body>
<div class="x-body">
    <div style="width:100%;height:400px;overflow: auto;">
        <div class="layui-form-item">
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 10px;">
                <legend style="font-size:16px;">基础配置</legend>
            </fieldset>
        </div>
        <div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief">
            <form class="layui-form layui-form-pane" style="margin-left: 20px;">
                <input type="hidden" name="pkid" id="pkid"  value="${we.pkid}"/>
                <input type="hidden" name="size" id="size"  value="${we.size}"/>
                <input type="hidden" name="imageName" id="imageName" value="${we.imageName}"/>
                <input type="hidden" name="simpleName" id="simpleName" value="${we.simpleName}"/>
                <div class="layui-form-item">
                    <label for="aboutUs" class="layui-form-label" style="width:200px;">
                        公司简介
                    </label>
                    <div class="layui-input-inline">
                        <input type="text"  id="aboutUs" name="aboutUs"
                               autocomplete="off" class="layui-input" placeholder="150字以内" value="${we.aboutUs}" maxlength="150" style="width:800px; height: 50px;">
                    </div>
                </div>
                <div class="layui-tab-item layui-show">
                    <div class="layui-form-item">
                        <label for="businessCooperation" class="layui-form-label" style="width:200px;">
                            商务合作
                        </label>
                        <div class="layui-input-inline">
                            <input type="text"  id="businessCooperation" name="businessCooperation"
                                   autocomplete="off" class="layui-input" placeholder="50字以内" maxlength="50" value="${we.businessCooperation}" style="width:800px; height: 50px;">
                        </div>
                    </div>
                </div>
                <div class="layui-tab-item layui-show">
                    <div class="layui-form-item">
                        <label for="update-image" class="layui-form-label" style="width:200px;">
                            公众号图片
                        </label>
                        <div class="layui-input-block">
                            <button type="button" class="layui-btn" id="update-image">
                                <i class="layui-icon">&#xe67c;</i>更新图片
                            </button>
                        </div>
                        <div class="layui-input-inline">
                            <img style="width: 200px;height: 200px;" id="updteImg" src="${we.wechatUrl}">
                        </div>
                    </div>
                </div>
                <div style="width: 100%;height: 55px;background-color: white;border-top:1px solid #e6e6e6;
position: fixed;bottom: 1px;margin-left:-20px;">
                    <div class="layui-form-item" style=" float: left;margin-right: 30px;margin-top: 8px">

                        <button  class="layui-btn layui-btn-normal" lay-filter="update" lay-submit style="margin-left: 50px">
                            保存
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script>
    $("#size").val($("#size").val().replace(/,/g, ""));
    layui.use(['form','layer','upload'], function(){
        $ = layui.jquery;
        var form = layui.form
                ,layer = layui.layer,
                upload = layui.upload;
//自定义验证规则
        form.verify({
            aboutUs: function (value) {
                if (value.trim() == ""||value.trim().length>150) {
                    return "公司简介内容不规范";
                }
            },
            businessCooperation: function (value) {
                if (value.trim() == ""||value.trim().length>50) {
                    return "商务合作内容不规范";
                }
            },
            imageName: function (value) {
                if (value.trim() == "") {
                    return "请上传图片";
                }
            }
        });
        //上传图片
        var uploadInst = upload.render({
            elem: '#update-image'
            , url: '/file/updateLogo'
            , auto: true
            , size: 800
            , done: function (res) {
                console.log(res.content);
                $('#size').val(res.content.size);
                $('#imageName').val(res.content.imageName);
                $('#simpleName').val(res.content.simpleName);
                $("#updteImg").attr("src",res.content.revealImage);
//              $('#image-show').html('<img id="enlarge" style="width: 120px; height: 150px; margin-left: 16px;" src="' + res.content.revealImage + '" alt=' + res.content.imageName + ' class="layui-upload-img">');
                layer.closeAll('loading'); //关闭loading
            }
        });
   $('#close').click(function(){
     var index = parent.layer.getFrameIndex(window.name);
     parent.layer.close(index);
   });
    //监听提交
        form.on('submit(update)', function(data){
            if ($("#aboutUs").val()==""||$("#aboutUs").val().length>150){
                layer.alert("公司简介内容不规范");
                return false;
            }
            if ($("#businessCooperation").val()==""||$("#businessCooperation").val().length>50){
                layer.alert("商务合作内容不规范");
                return false;
            }
            if ($("#imageName").val()==""){
                layer.alert("请上传图片");
                return false;
            }
            $.ajax({
                url:'/aboutWe/updateAboutWe',
                type:'post',
                data:data.field,
                async:false,
                traditional: true,
                success:function(){
                    window.location.href='/aboutWe/getAboutWe';
                },error:function(){
                    alert("保存失败");
                }
            });
            return false;
        });
        form.render();
  });
</script>
</body>

</html>
