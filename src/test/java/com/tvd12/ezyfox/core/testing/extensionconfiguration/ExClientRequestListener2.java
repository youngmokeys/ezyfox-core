package com.tvd12.ezyfox.core.testing.extensionconfiguration;

import com.tvd12.ezyfox.core.annotation.ClientRequestListener;
import com.tvd12.ezyfox.core.annotation.ExecuteMethod;
import com.tvd12.ezyfox.core.content.AppContext;

@ClientRequestListener(command = "abc")
public class ExClientRequestListener2 {

    @ExecuteMethod
    public void execute1(AppContext context, ExampleUser user) {
        
    }
    
}
