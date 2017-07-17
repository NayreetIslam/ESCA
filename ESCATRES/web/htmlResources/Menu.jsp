<div id="sidebar-wrapper" style="background-color: #337ab7;">    
    <ul class="sidebar-nav">
        <li class="sidebar-brand">
            <a href="/ESCATRES/index.jsp">
                ESCA
            </a>
        </li>
        <li>
            <a href="/ESCATRES/Assistant?action=start">Assistant</a>
        </li>
        <li id="adminMenu">
            <a href="#">Admin <span class="glyphicon glyphicon-chevron-down" aria-hidden="true"> </span></a>
            <ul id="adminOptions" style="display:none; list-style: none">    
                <li style="">
                    <a href="/ESCATRES/backend/admin.jsp">All</a>
                </li>
                <li>
                    <a href="#">Hardware/Devices</a>
                </li>
                <li>
                    <a href="#">Requirements/Constraints</a>
                </li>
                <li>
                    <a href="#">Types</a>
                </li>
            </ul>    
        </li>

        <li>
            <a href="#">About</a>
        </li>

        <li>
            <a href="#">Contact</a>
        </li>
    </ul>
</div>
        
<script type="text/javascript">
    
    $(document).ready(function() {
        $('#adminMenu').click(function(){
        
        if( $('#adminOptions').is(':hidden')){
           $('#adminOptions').show('fast');
        }
        else{
            $('#adminOptions').hide('fast');
        } 

        //$("#extraFeaturesDiv").load('Assistant?action=listExtraFeature&idSelected='+$('#genPurpList option:selected').val());
        });
   });

    
</script>