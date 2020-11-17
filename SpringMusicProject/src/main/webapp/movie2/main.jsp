<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.row {
   margin: 0px auto;
   width:1500px;
}
</style>
<script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
<script type="text/javascript">
$(function(){
    $.ajax({
       type:'POST',
       url:'movie_data.do', //메인이랑 같이있어서 ..으로 안남겨도 쌉가능
       success:function(result)
       {
          //alert(result);
         let data=JSON.parse(result.trim());
         for(let i=0;i<data.length;i++)
         {
              $('#movie_list').append(
                  "<tr>"
                  +"<td>"
                  +"<img src=http://www.kobis.or.kr"+data[i].thumbUrl+" width=30 height=30>"
                  +"</td>"
                  +"<td>"+data[i].movieNm+"</td>"
                  +"<td>"+data[i].director+"</td>"
                  +"<td>"+data[i].genre+"</td>"
                  +"<td>"+data[i].watchGradeNm+"</td></tr>"
               );
         }
      }
    });
    $('span').click(function(){
       let no=$(this).attr("value");
       $.ajax({
           type:'POST',
           url:'movie_data.do', //메인이랑 같이있어서 ..으로 안남겨도 쌉가능
           data:{"no":no},
           success:function(result)
           {
              //alert(result);
             let data=JSON.parse(result.trim());
             let res=""
             for(let i=0;i<data.length;i++)
             {
                  
                      res+="<tr>"
                            +"<td>"
                            +"<img src=http://www.kobis.or.kr"+data[i].thumbUrl+" width=30 height=30>"
                            +"</td>"
                            +"<td>"+data[i].movieNm+"</td>"
                            +"<td>"+data[i].director+"</td>"
                            +"<td>"+data[i].genre+"</td>"
                            +"<td>"+data[i].watchGradeNm+"</td></tr>";
                   
             }
             $('#movie_list').html(res);
          }
        });
    })
      /* console.log('확인');
   $.getJSON("http://localhost/web/movie2/movie_data.do",function(data){
      
      console.log('확인');
      $.each(data["data"],function(index,vo)
      {
         $('#movie_list').append(
            "<tr>"
            +"<td>"
            +"<img src="+vo.thumbUrl+" width=30 height=30>"
            +"</td>"
            +"<td>"+vo.movieNm+"</td>"
            +"<td>"+vo.director+"</td>"
            +"<td>"+vo.genre+"</td>"
            +"<td>"+vo.watchGradeNm+"</td></tr>"
         );
      })
   }); */
})
</script>
</head>
<body>
   <div style="height:30px"></div>
   <div class="container">
      <div class="row">
         <div class="text-center">
            <span class="btn btn-sm btn-primary" value="1">박스오피스</span>
            <span class="btn btn-sm btn-success" value="2">실시간 예매율</span>
            <span class="btn btn-sm btn-danger" value="3">좌석 점유율</span>
            <span class="btn btn-sm btn-warning" value="4">온라인 이용순위</span>
         </div>
      </div>
      <div class="row">
         <div class="col-sm-4">
            
         </div>
         <div class="col-sm-8">
            <table class="table table-striped">
               <thead>
                  <tr>
                     <th class="text-center"></th>
                     <th class="text-center">영화명</th>
                     <th class="text-center">감독</th>
                     <th class="text-center">장르</th>
                     <th class="text-center">등급</th>
                  </tr>
               </thead>
               <tbody id="movie_list">
                     
               </tbody>
            </table>
         </div>
      </div>
   </div>
</body>
</html>