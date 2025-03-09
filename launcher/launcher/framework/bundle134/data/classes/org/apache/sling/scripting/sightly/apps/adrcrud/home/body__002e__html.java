/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.adrcrud.home;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class body__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
Object _global_samplerequest = null;
out.write("<!-- /*\n    Licensed to the Apache Software Foundation (ASF) under one\n    or more contributor license agreements.  See the NOTICE file\n    distributed with this work for additional information\n    regarding copyright ownership.  The ASF licenses this file\n    to you under the Apache License, Version 2.0 (the\n    \"License\"); you may not use this file except in compliance\n    with the License.  You may obtain a copy of the License at\n\n    http://www.apache.org/licenses/LICENSE-2.0\n\n    Unless required by applicable law or agreed to in writing,\n    software distributed under the License is distributed on an\n    \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\n    KIND, either express or implied.  See the License for the\n    specific language governing permissions and limitations\n    under the License.\n*/ -->\n<h2>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "jcr:title"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h2>\n<p><b><i>Description: </i></b>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "jcr:description"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\n");
_global_samplerequest = renderContext.call("use", org.tr.sling.demo.adrcrud.models.SampleRequestModel.class.getName(), obj());
out.write("<div>\n\t<p>");
{
    String var_2 = ("Current User: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_samplerequest, "currentUser"), "text")));
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</p>\n</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

