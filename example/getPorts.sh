if [ "$#" -ne 2 ]; then
  echo "Usage: getPorts.sh TOKEN DPID" >&2
  exit 1
fi
curl -s --header "X-Auth-Token:$1" -k -X GET "https://van99:8443/sdn/v2.0/of/datapaths/$2/ports" | $PWD/pjson.py | more
