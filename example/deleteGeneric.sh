#!/bin/sh
if [ "$#" -ne 3 ]; then
  echo "Usage: deleteGeneric.sh TOKEN DPID FLOW" >&2
  exit 1
fi
curl -sk -H "X-Auth-Token:$1" -X DELETE -H 'Content-Type:application/json' "https://van99.netlab.uky.edu:8443/sdn/v2.0/of/datapaths/$2/flows" -d @$3
