package cordova.plugin.mathcalc;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class MathCalc extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("add")) {
            this.add(args, callbackContext);
            return true;
        }
        if (action.equals("substract")) {
            this.substract(args, callbackContext);
            return true;
        }
        return false;
    }

    private void add(JSONArray args, CallbackContext callbackContext) {
        if (args != null ) {
            try{

                int p1= Interger.parseInt(args.getJSONObject(0).getString('param1'))
                int p2= Interger.parseInt(args.getJSONObject(0).getString('param2'))

                callbackContext.success("The Addition is-> "+(p1+p2));

            }catch(Exception e)
            {
                callbackContext.error("Calculation Problem "+e.toString() );
            }
        } else {
            callbackContext.error("Please non-empty value.");
        }
    }


    private void substract(JSONArray args, CallbackContext callbackContext) {
        if (args != null ) {
            try{

                int p1= Interger.parseInt(args.getJSONObject(0).getString('param1'))
                int p2= Interger.parseInt(args.getJSONObject(0).getString('param2'))

                callbackContext.success("The substraction is-> "+(p1-p2));

            }catch(Exception e)
            {
                callbackContext.error("Calculation Problem "+e.toString() );
            }
        } else {
            callbackContext.error("Please non-empty value.");
        }
    }
}
