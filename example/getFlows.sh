if [ "$#" -ne 2 ]; then
  echo "Usage: getFlows.sh TOKEN DPID" >&2
  exit 1
fi
curl -s --header "X-Auth-Token:$1" -k -X GET "https://van88.netlab.uky.edu:8443/sdn/v2.0/of/datapaths/$2/flows" | $PWD/pjson.py | more
